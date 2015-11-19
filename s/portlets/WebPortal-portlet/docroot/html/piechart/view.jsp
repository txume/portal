<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page pageEncoding="UTF-8" %>
<portlet:defineObjects />




<!DOCTYPE html>
<html>
<head>
 
    <link href="<%=request.getContextPath()%>/css/application.min.css" rel="stylesheet" />
    <link rel="shortcut icon" href="<%=request.getContextPath()%>/img/favicon.png" />
    <script src="<%=request.getContextPath()%>/lib/jquery/jquery.1.9.0.min.js"> </script>
    <script src="<%=request.getContextPath()%>/lib/jquery/jquery-migrate-1.1.0.min.js"> </script>
    <script src="<%=request.getContextPath()%>/lib/uniform/js/jquery.uniform.js"></script>
    <!--<script src="lib/zepto/zepto.min.js"> </script>-->
    <script src="<%=request.getContextPath()%>/js/bootstrap/bootstrap-tab.js"> </script>
    <script src="<%=request.getContextPath()%>/lib/parsley/parsley.js"> </script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <meta charset="utf-8" />
    
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
<body class="background-dark">

<portlet:defineObjects />
<%
int[] transactions = (int[])renderRequest.getAttribute("transactions");
%>


<div id="RT" style="display:none;"><%=transactions[0] %></div>
<div id="LL" style="display:none;"><%=transactions[1] %></div>
<div id="AD" style="display:none;"><%=transactions[2] %></div>
<div id="HM" style="display:none;"><%=transactions[3] %></div>




            <div class="span3" style="width: 100%;height: 100%;">
                <section class="widget large">
                    <header>
                        <h4 style="text-align: right;"> تصنيف المعاملات خلال شهر</h4>
                    </header>
                    <div class="body">
                        <div id="sources-chart-pie" class="chart pie-chart">
                            <svg></svg>
                        </div>
                    </div>
                    <footer id="data-chart-footer" class="pie-chart-footer">
                    </footer>
                </section>
            </div>


<!-- d3, nvd3-->
<script src="<%=request.getContextPath()%>/lib/nvd3/lib/d3.v2.js"></script>
<script src="<%=request.getContextPath()%>/lib/nvd3/nv.d3.custom.js"></script>

<!-- nvd3 models -->
<script src="<%=request.getContextPath()%>/lib/nvd3/src/models/scatter.js"></script>
<script src="<%=request.getContextPath()%>/lib/nvd3/src/models/axis.js"></script>
<script src="<%=request.getContextPath()%>/lib/nvd3/src/models/legend.js"></script>
<script src="<%=request.getContextPath()%>/lib/nvd3/src/models/stackedArea.js"></script>
<script src="<%=request.getContextPath()%>/lib/nvd3/src/models/stackedAreaChart.js"></script>
<script src="<%=request.getContextPath()%>/lib/nvd3/src/models/line.js"></script>
<script src="<%=request.getContextPath()%>/lib/nvd3/src/models/pie.js"></script>
<script src="<%=request.getContextPath()%>/lib/nvd3/src/models/pieChartTotal.js"></script>
<script src="<%=request.getContextPath()%>/lib/nvd3/stream_layers.js"></script>
<script src="<%=request.getContextPath()%>/lib/nvd3/src/models/lineChart.js"></script>
<script src="<%=request.getContextPath()%>/lib/nvd3/src/models/multiBar.js"></script>
<script src="<%=request.getContextPath()%>/lib/nvd3/src/models/multiBarChart.js"></script>

<!--backbone and friends -->
<script src="<%=request.getContextPath()%>/lib/backbone/underscore-min.js"></script>

<!-- bootstrap default plugins -->
<script src="<%=request.getContextPath()%>/js/bootstrap/bootstrap-transition.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap/bootstrap-collapse.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap/bootstrap-tooltip.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap/bootstrap-popover.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap/bootstrap-button.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap/bootstrap-dropdown.js"></script>

<!-- basic application js-->
<script src="<%=request.getContextPath()%>/js/app.js"></script>
<%-- <script src="<%=request.getContextPath()%>/js/settings.js"></script> --%>

<!-- page specific -->
<script src="<%=request.getContextPath()%>/js/stats.js"></script>


<script type="text/template" id="settings-template">
    <div class="setting clearfix">
        <div>Background</div>
        <div id="background-toggle" class="pull-left btn-group" data-toggle="buttons-radio">
            <\% dark = background == 'dark'; light = background == 'light';%>
            <button type="button" data-value="dark" class="btn btn-small btn-transparent <\%= dark? 'active' : '' %>">Dark</button>
            <button type="button" data-value="light" class="btn btn-small btn-transparent <\%= light? 'active' : '' %>">Light</button>
        </div>
    </div>
    <div class="setting clearfix">
        <div>Sidebar on the</div>
        <div id="sidebar-toggle" class="pull-left btn-group" data-toggle="buttons-radio">
            <\% onRight = sidebar == 'right'%>
            <button type="button" data-value="left" class="btn btn-small btn-transparent <\%= onRight? '' : 'active' %>">Left</button>
            <button type="button" data-value="right" class="btn btn-small btn-transparent <\%= onRight? 'active' : '' %>">Right</button>
        </div>
    </div>
    <div class="setting clearfix">
        <div>Sidebar</div>
        <div id="display-sidebar-toggle" class="pull-left btn-group" data-toggle="buttons-radio">
            <\% display = displaySidebar%>
            <button type="button" data-value="true" class="btn btn-small btn-transparent <\%= display? 'active' : '' %>">Show</button>
            <button type="button" data-value="false" class="btn btn-small btn-transparent <\%= display? '' : 'active' %>">Hide</button>
        </div>
    </div>
</script>



<script type="text/template" id="sidebar-settings-template">
        <\% auto = sidebarState == 'auto'%>
        <\% if (auto) {%>
            <button type="button"
                    data-value="icons"
                    class="btn-icons btn btn-transparent btn-small">Icons</button>
    <button type="button"
            data-value="auto"
            class="btn-auto btn btn-transparent btn-small">Auto</button>
        <\%} else {%>
            <button type="button"
                    data-value="auto"
                    class="btn btn-transparent btn-small">Auto</button>
        <\% } %>
</script>

</body>
</html>
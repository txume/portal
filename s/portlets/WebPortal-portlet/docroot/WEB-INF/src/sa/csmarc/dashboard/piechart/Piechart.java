package sa.csmarc.dashboard.piechart;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.transaction.Transaction;

import sa.csmarc.dashboard.NoSuchtransactionsException;
import sa.csmarc.dashboard.model.impl.*;
import sa.csmarc.dashboard.service.*;
import sa.csmarc.dashboard.service.impl.transactionsLocalServiceImpl;
import sa.csmarc.dashboard.service.persistence.transactionsPersistenceImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Piechart
 */
public class Piechart extends MVCPortlet {
 
	
    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
    throws IOException, PortletException {
        
    	transactionsLocalServiceImpl service = new transactionsLocalServiceImpl();
        int[] array = {0,0,0,0};
		try {
			array = service.getTransactions();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        renderRequest.setAttribute("transactions", array);
        super.doView(renderRequest, renderResponse);
    }
}

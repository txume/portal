YUI.add("promise",function(e,t){function i(e){if(!(this instanceof i))return new i(e);var t=new i.Resolver(this);this._resolver=t;try{e.call(this,function(e){t.resolve(e)},function(e){t.reject(e)})}catch(n){t.reject(n)}}function s(e){this._callbacks=[],this._errbacks=[],this.promise=e,this._status="pending",this._result=null}var n=e.Lang,r=[].slice;e.mix(i.prototype,{then:function(e,t){var n=this.constructor,r=this._resolver;return new n(function(n,s){r._addCallbacks(typeof e=="function"?i._wrap(n,s,e):n,typeof t=="function"?i._wrap(n,s,t):s)})},"catch":function(e){return this.then(undefined,e)},getStatus:function(){return this._resolver.getStatus()}}),i._wrap=function(e,t,n){return function(r){var i;try{i=n(r)}catch(s){t(s);return}e(i)}},i.isPromise=function(e){var t;try{t=e.then}catch(n){}return typeof t=="function"},i.resolve=function(e){return i.isPromise(e)&&e.constructor===this?e:new this(function(t){t(e)})},i.reject=function(e){return new this(function(t,n){n(e)})},i.all=function(e){var t=this;return new t(function(r,i){function f(e){return function(t){a[e]=t,s--,s||r(a)}}if(!n.isArray(e)){i(new TypeError("Promise.all expects an array of values or promises"));return}var s=e.length,o=0,u=e.length,a=[];if(u<1)return r(a);for(;o<u;o++)t.resolve(e[o]).then(f(o),i)})},i.race=function(e){var t=this;return new t(function(r,i){if(!n.isArray(e)){i(new TypeError("Promise.race expects an array of values or promises"));return}for(var s=0,o=e.length;s<o;s++)t.resolve(e[s]).then(r,i)})},e.Promise=i,e.mix(s.prototype,{fulfill:function(e){this._status==="pending"&&(this._result=e,this._status="fulfilled"),this._status==="fulfilled"&&(this._notify(this._callbacks,this._result),this._callbacks=[],this._errbacks=null)},reject:function(e){this._status==="pending"&&(this._result=e,this._status="rejected"),this._status==="rejected"&&(this._notify(this._errbacks,this._result),this._callbacks=null,this._errbacks=[])},resolve:function(e){var t=this;i.isPromise(e)?e.then(function(e){t.resolve(e)},function(e){t.reject(e)}):this.fulfill(e)},then:function(e,t){return this.promise.then(e,t)},_addCallbacks:function(e,t){var n=this._callbacks,r=this._errbacks,i=this._status,s=this._result;n&&typeof e=="function"&&n.push(e),r&&typeof t=="function"&&r.push(t),i==="fulfilled"?this.fulfill(s):i==="rejected"&&this.reject(s)},getStatus:function(){return this._status},_notify:function(t,n){t.length&&e.soon(function(){var e,r;for(e=0,r=t.length;e<r;++e)t[e](n)})}},!0),e.Promise.Resolver=s,e.when=function(e,t,n){return e=i.resolve(e),t||n?e.then(t,n):e},e.batch=function(){return i.all(r.call(arguments))}},"patched-v3.11.0",{requires:["timers"]});

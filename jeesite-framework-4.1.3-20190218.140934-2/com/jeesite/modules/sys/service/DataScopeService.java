package com.jeesite.modules.sys.service;	
	
import com.jeesite.common.entity.TreeEntity;	
import com.jeesite.common.service.api.BaseServiceApi;	
	
public interface DataScopeService extends BaseServiceApi {	
   void insertIfParentExists(TreeEntity var1, String var2);	
}	

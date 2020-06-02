package com.orlando.jsf.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.orlando.jsf.bean.MainBean;
import com.orlando.jsf.bean.UpdateAlbumBean;

@ManagedBean(name = "viewContext")
@ViewScoped
public class ViewContext implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8786816465243329004L;
	private MainBean mainBean;
	

	public UpdateAlbumBean updateAlbumBean;
	
	public MainBean getMainBean() {
		if (mainBean == null) {
			mainBean = new MainBean();
		} 
		return mainBean;
	}
	
	public UpdateAlbumBean getUpdateAlbumBean() {
		if (updateAlbumBean == null) {
			updateAlbumBean = new UpdateAlbumBean();
		}
		return updateAlbumBean;
	}
	

}

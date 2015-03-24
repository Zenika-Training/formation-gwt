package com.zenika.resanet.gwt.client.widget;

import java.util.Date;

import com.google.gwt.dom.client.Element;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.TextBox;

public class MyDatePicker extends TextBox {
	public MyDatePicker() {
		initDatePicker(getElement());
	}

	private native void initDatePicker(Element element) /*-{
		$wnd.jQuery(element).datepicker({
			dateFormat : 'yy-mm-dd'
		});
	}-*/;

	public Date getDate() {
		String nativeGetDate = nativeGetDate(this.getElement());
		return DateTimeFormat.getFormat("yyyy-MM-dd").parse(nativeGetDate);
	}

	private native String nativeGetDate(Element element) /*-{
		return $wnd.jQuery(element).val();
	}-*/;
}

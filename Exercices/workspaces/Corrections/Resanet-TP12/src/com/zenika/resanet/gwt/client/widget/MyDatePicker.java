package com.zenika.resanet.gwt.client.widget;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.TextBox;

public class MyDatePicker extends TextBox {
	public MyDatePicker() {
		initDatePicker(this.getElement());
	}

	private native void initDatePicker(Element element) /*-{
		$wnd.jQuery(element).datepicker({
			format : 'yyyy-mm-dd'
		});
	}-*/;

	public Date getDate() {
		return DateTimeFormat.getFormat("yyyy-MM-dd").parse(
				nativeGetDate(this.getElement()));
	}

	private native String nativeGetDate(Element element) /*-{
		return $wnd.jQuery(element).val();
	}-*/;
}

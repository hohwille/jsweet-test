/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.widget.factory;

import net.sf.mmm.client.ui.api.widget.UiWidgetButton;
import net.sf.mmm.client.ui.api.widget.UiWidgetNative;

/**
 * TODO: this class ...
 *
 * @author hohwille
 * @since 1.0.0
 */
public interface UiWidgetFactory {

  <WIDGET extends UiWidgetNative> WIDGET create(Class<WIDGET> widgetInterface);

  default UiWidgetButton createButton(String label, Runnable onClick) {

    UiWidgetButton button = create(UiWidgetButton.class);
    button.setLabel(label);
    button.setClickListener(onClick);
    return button;
  }

}

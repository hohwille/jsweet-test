/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.widget;

/**
 * TODO: this class ...
 *
 * @author hohwille
 * @since 1.0.0
 */
public interface UiWidget {

  UiWidgetComposite getParent();

  boolean isVisible();

  void setVisible(boolean visible);

}

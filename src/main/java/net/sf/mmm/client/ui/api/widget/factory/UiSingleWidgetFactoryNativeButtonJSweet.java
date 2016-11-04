/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.widget.factory;

import net.sf.mmm.client.ui.api.widget.UiWidgetButton;
import net.sf.mmm.client.ui.api.widget.UiWidgetButtonImplJSweet;

/**
 * TODO: this class ...
 *
 * @author hohwille
 * @since 1.0.0
 */
public class UiSingleWidgetFactoryNativeButtonJSweet implements UiSingleWidgetFactoryNative<UiWidgetButton> {

  /**
   * The constructor.
   *
   */
  public UiSingleWidgetFactoryNativeButtonJSweet() {
    super();
  }

  @Override
  public Class<UiWidgetButton> getWidgetInterface() {

    return UiWidgetButton.class;
  }

  @Override
  public UiWidgetButton create() {

    return new UiWidgetButtonImplJSweet();
  }

}

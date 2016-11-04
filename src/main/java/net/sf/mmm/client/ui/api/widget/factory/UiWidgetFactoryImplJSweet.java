/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.widget.factory;

import java.util.HashMap;
import java.util.Map;

import net.sf.mmm.client.ui.api.widget.UiWidgetNative;

/**
 * TODO: this class ...
 *
 * @author hohwille
 * @since 1.0.0
 */
public class UiWidgetFactoryImplJSweet implements UiWidgetFactory {

  private final Map<Class<? extends UiWidgetNative>, UiSingleWidgetFactoryNative<?>> interface2subFactoryMap;

  /**
   * The constructor.
   */
  public UiWidgetFactoryImplJSweet() {
    super();
    this.interface2subFactoryMap = new HashMap<>();
    register(new UiSingleWidgetFactoryNativeButtonJSweet());
  }

  protected void register(UiSingleWidgetFactoryNative<?> subFactory) {

    UiSingleWidgetFactoryNative<?> oldFactory = this.interface2subFactoryMap.put(subFactory.getWidgetInterface(), subFactory);
    if (oldFactory != null) {
      throw new IllegalStateException(subFactory.getWidgetInterface().getName());
    }
  }

  @Override
  public <WIDGET extends UiWidgetNative> WIDGET create(Class<WIDGET> widgetInterface) {

    // TODO Auto-generated method stub
    return null;
  }

}

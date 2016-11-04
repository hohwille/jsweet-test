/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.widget;

import jsweet.dom.HTMLButtonElement;
import jsweet.util.StringTypes;

/**
 * TODO: this class ...
 *
 * @author hohwille
 * @since 1.0.0
 */
public class UiWidgetButtonImplJSweet implements UiWidgetButton {

  private HTMLButtonElement button;

  /**
   * The constructor.
   */
  public UiWidgetButtonImplJSweet() {
    super();
  }

  /**
   * @return the button
   */
  public HTMLButtonElement getButton() {

    if (this.button == null) {
      this.button = new HTMLButtonElement();
    }
    return this.button;
  }

  @Override
  public UiWidgetComposite getParent() {

    return null;
  }

  @Override
  public boolean isVisible() {

    return !getButton().hidden;
  }

  @Override
  public void setVisible(boolean visible) {

    getButton().hidden = !visible;
  }

  @Override
  public void setLabel(String label) {

    getButton().textContent = label;
  }

  @Override
  public String getLabel() {

    return getButton().textContent;
  }

  @Override
  public void setClickListener(final Runnable onClick) {

    getButton().addEventListener(StringTypes.click, x -> {
      onClick.run();
      return null;
    });
  }

}

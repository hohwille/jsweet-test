package quickstart;

import static def.jquery.Globals.$;
import static jsweet.dom.Globals.alert;

import java.util.ArrayList;
import java.util.List;

import jsweet.lang.Array;
import net.sf.mmm.client.ui.api.widget.UiWidgetButton;
import net.sf.mmm.client.ui.api.widget.UiWidgetButtonImplJSweet;
import net.sf.mmm.client.ui.api.widget.factory.UiWidgetFactory;
import net.sf.mmm.client.ui.api.widget.factory.UiWidgetFactoryImplJSweet;

/**
 * This class is used within the webapp/index.html file.
 */
public class QuickStart {

  public static void main(String[] args) {

    // you can use regular Java API thanks to the J4TS candy
    List<String> l = new ArrayList<>();
    l.add("Hello");
    l.add("world");
    // and you can also use regular JavaScript APIs
    Array<String> a = new Array<>();
    String string = "";
    a.push(string.getClass().getName());
    a.push(QuickStart.class.getName());
    for (String s : l) {
      a.push(s);
    }
    // use of jQuery with the jQuery candy
    $("#target").text(l.toString());

    UiWidgetFactory factory = new UiWidgetFactoryImplJSweet();
    UiWidgetButton button = factory.createButton("Click me", () -> {
      alert("Button clicked");
    });
    $("#target").iterator().next().appendChild(((UiWidgetButtonImplJSweet) button).getButton());
    // use of the JavaScript DOM API
    alert(a.toString());
  }

}

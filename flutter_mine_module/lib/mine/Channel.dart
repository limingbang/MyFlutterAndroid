import 'package:flutter/services.dart';

class Channel {

  MethodChannel channel;

  Channel() {
    channel = MethodChannel('com.jwstudio.mine/webView');
  }

  void startWebViewActivity(String url) async {
    var map = Map();
    try {
      map['url'] = url;
      String result = await channel.invokeMethod('start', map);
    } on PlatformException catch (e) {
      print(e);
    } on MissingPluginException catch(e) {
      print('miss method');
      print(e);
    }
  }

}
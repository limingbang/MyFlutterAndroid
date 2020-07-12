import 'package:flutter/material.dart';
import 'package:flutter_mine_module/mine/Channel.dart';

class MinePageWidget extends StatelessWidget {
  
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Mine',
      home: Scaffold(
        appBar: AppBar(
          title: Text('Mine'),
        ),
        body: Center(
          child: Column(
            children: <Widget>[
              FlatButton(
                child: Text('start'),
                onPressed: () {
                  Channel().startWebViewActivity('https://www.baidu.com');
                },
              ),
              Text('调试')
            ],
          )
        ),
      ),
    );
  }
  
}

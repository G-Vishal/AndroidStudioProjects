import 'package:flutter/material.dart';

void main() => runApp(MyCalcApp());

class MyCalcApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(title: 'My Calc Flutter', home: MyCalculator());
  }
}

class MyCalculator extends StatefulWidget {
  @override
  State<StatefulWidget> createState() => Calculator();
}

class Calculator extends State<MyCalculator> {
  //Register the Controllers for Textfield
  final controller_numberA = TextEditingController();
  final controller_numberB = TextEditingController();
  final my_form_key = GlobalKey<FormState>();

  String text_to_show = "";

  //create a functions
  void sum() {
    //validity form
    if (my_form_key.currentState.validate()) {
      int numberA = int.parse(controller_numberA.text);
      int numberB = int.parse(controller_numberB.text);
      int result = numberA + numberB;

      setState(() {
        text_to_show = "$numberA + $numberB = $result";
      });
    }
  }

  void sub() {
    //validity form
    if (my_form_key.currentState.validate()) {
      int numberA = int.parse(controller_numberA.text);
      int numberB = int.parse(controller_numberB.text);
      int result = numberA - numberB;

      setState(() {
        text_to_show = "$numberA - $numberB = $result";
      });
    }
  }

  void multi() {
    //validity form
    if (my_form_key.currentState.validate()) {
      int numberA = int.parse(controller_numberA.text);
      int numberB = int.parse(controller_numberB.text);
      int result = numberA * numberB;

      setState(() {
        text_to_show = "$numberA * $numberB = $result";
      });
    }
  }

  void divide() {
    //validity form
    if (my_form_key.currentState.validate()) {
      int numberA = int.parse(controller_numberA.text);
      int numberB = int.parse(controller_numberB.text);
      double result = numberA / numberB;

      setState(() {
        text_to_show = "$numberA / $numberB = $result";
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    //create Layout
    return Scaffold(
        body: Form(
            key: my_form_key,
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                //create 2 text Field
                TextFormField(
                    controller: controller_numberA,
                    validator: (value) {
                      if (value.isEmpty) return "Please Enter the Number";
                    },
                    decoration: InputDecoration(hintText: "Enter Number"),
                    keyboardType: TextInputType.number),
                TextFormField(
                    controller: controller_numberB,
                    validator: (value) {
                      if (value.isEmpty) return "Please Enter the Number";
                    },
                    decoration: InputDecoration(hintText: "Enter Number"),
                    keyboardType: TextInputType.number),

                //create result Field
                Text(
                  text_to_show,
                  style: TextStyle(fontSize: 20.0),
                ),
                //create 4 arthmatic buttons
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: <Widget>[
                    RaisedButton(
                      onPressed: sum,
                      child: Text('+'),
                    ),
                    RaisedButton(
                      onPressed: sub,
                      child: Text('-'),
                    ),
                    RaisedButton(
                      onPressed: multi,
                      child: Text('*'),
                    ),
                    RaisedButton(
                      onPressed: divide,
                      child: Text('/'),
                    ),
                  ],
                )
              ],
            )));
  }
}

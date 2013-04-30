SessionM CPI Sample Code and Demo Project for Android
=====

This repo contains the sample code for setting up CPI campaigns with SessionM.

SessionMTransaction provides an example of how to contact SessionM with an install transaction.
 
There is also a listener interface provided so the app can receive updates about transaction results.
An app key (obtained from SessionM) is required to use this class. 
This class uses the android id as well as the wifi mac-address and the device id to identify the transaction.
This class requires `INTERNET` permission. If `ACCESS_WIFI_STATE` or `READ_PHONE_STATE` permissions are available it will pull the mac-address and device id respectively.
 
Usage
-----

    SessionMTransaction txn = new SessionMTransaction(this, "<YOUR-APP-KEY-HERE>");
    txn.start();
 
This should generally be run when your app first starts up.

Troubleshooting
This class provides some logging of what it is doing, to turn it up do the following:

    adb shell setprop log.tag.SessionM.CPI DEBUG

then run:

    adb logcat

If everything is working properly you should something like this the first time you start your app:

    Sent install for appKey: <YOUR-APP-KEY> response code: 201


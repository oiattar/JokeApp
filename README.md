# JokeApp

This is an app that displays hilarious jokes using Google Cloud Endpoints

# Overview
* The app has multiple flavors, Free and Paid flavors.
* The Free flavor contains an AdView to display the ads, while the Paid flavor don't.
* Java library contains the functionality of retrieving jokes from Google Cloud Endpoints "GCE".
* Android Library contains an Android Activity to display the joke.

To start the local server please open the Gradle pane in the `Android Studio` > `:backend` > `Tasks` > `app engine standard enviorment` > execute the `appengineStart` Task.
and execute the `appengineStop` to stop it.

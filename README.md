Private application to connect users to businesses. Basic prototype demonstration is below:

![alt tag](https://github.com/davidlevitsky/friendsTime/blob/master/FriendsTimeDemo.gif)

Application features:

1. User log-in
2. Multiple calendar views (monthly, weekly, daily)
3. Dynamic display of today's events/upcoming events 
4. Events are editable(can be updated or deleted)
5. User's contacts populate the list of potential participants
6. Lists of actions, participants, and notes to specify event details

Implementation Details:

- Parse DB to handle data management
- Parse User Authentication mechanism to handle user log-in
- Parse Push technology for push notifications
- Intents and custom listeners to communicate between activities and fragments
- Dialog fragments to decrease work on main thread and speed up application
- Vertical ScrollView
- Android Contact API to retrieve user's contacts


More features are currently in progress such as monitoring the staus of an event and implementing full button functionality.

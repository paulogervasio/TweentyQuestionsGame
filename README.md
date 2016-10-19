# Twenty Questions Game
A simple decision tree prediction algorithm java implementation.


Game description:
```
The game 20Q is based on the spoken parlor game known as twenty questions, and. 
20Q asks the player to think of something and will then try to guess what they are thinking of with twenty yes-or-no questions. 
If it fails to guess in 20 questions, it will ask an additional 5 questions. 
If it fails to guess even with 25 (or 30) questions, the player is declared the winner. 
Sometimes the first guess of the object can be asked at question 14.
```

Initially, the game has no database data. 
So the more you play and inserts correct answers the new answers will be more assertive.
The system will learn from the moves data entry, whether correct or not.




##To generate a executable file:
 
```
git clone https://github.com/paulogervasio/TweentyQuestionsGame;  
cd TweentyQuestionsGame;  
mvn package; 
```
After compiled just run:  

```
cd target 
java -jar animal_game20-0.0.1-SNAPSHOT.jar
```


TODO
- Serialize data for answers


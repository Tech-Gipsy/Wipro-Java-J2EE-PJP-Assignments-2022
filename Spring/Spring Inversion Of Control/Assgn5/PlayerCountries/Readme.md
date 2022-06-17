 There are two Model classes as below:
Player
 playerId -&gt; String -&gt; P001
 playerName -&gt; String -&gt; Sachin
 country -&gt; Object -&gt; of type ‘Country’

Country
 countryId -&gt; String -&gt; C001
 countryName -&gt; String -&gt; ‘India’ 

Every player belongs to a particular country. Create a spring program to create 5 players and 2
countries. 2 players belong to one country and the other 3 players belong to another country.
The client program should display the details of all players and their corresponding country
details. If given a country name, it should also display all the player names who belong to that
country.
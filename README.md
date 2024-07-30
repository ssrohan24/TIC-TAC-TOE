<h1>Tic-Tac-Toe Game</h1>

<p>This Java project implements a simple command-line Tic-Tac-Toe game. The game allows two players to play against each other by taking turns to place their markers ('X' or 'O') on a 3x3 grid. The first player to align three markers horizontally, vertically, or diagonally wins the game.</p>

<h2>Table of Contents</h2>
<ul>
  <li><a href="#description">Description</a></li>
  <li><a href="#installation">Installation</a></li>
  <li><a href="#how-to-play">How to Play</a></li>
  <li><a href="#code-structure">Code Structure</a></li>
  <li><a href="#license">License</a></li>
</ul>

<h2 id="description">Description</h2>
<p>This project provides a classic implementation of the Tic-Tac-Toe game in Java. It is designed to be played in the console, offering an interactive experience for two players. The game handles displaying the board, taking player input, placing markers, and checking for win conditions.</p>

<h2 id="installation">Installation</h2>
<p>To run the game, ensure that Java is installed on your machine. Clone this repository and navigate to the project directory:</p>
<pre><code>git clone &lt;repository_url&gt;
cd &lt;repository_name&gt;
</code></pre>
<p>Compile and run the Java program using the following commands:</p>
<pre><code>javac TicTacToe.java
java TicTacToe
</code></pre>

<h2 id="how-to-play">How to Play</h2>
<ol>
  <li><strong>Start the game</strong>: The program prompts Player 1 to choose a marker ('X' or 'O').</li>
  <li><strong>Take turns</strong>: Players alternate turns to place their markers by selecting a position number (1-9).</li>
  <li><strong>Win the game</strong>: The first player to align three markers in a row (horizontally, vertically, or diagonally) wins.</li>
</ol>

<h3>Example Game Board</h3>
<pre><code>
   |   |
 X | O | X
   |   |
-----------
   |   |
 O | X | O
   |   |
-----------
   |   |
 X | O | X
   |   |
</code></pre>

<h2 id="code-structure">Code Structure</h2>
<ul>
  <li><strong>Displaying the Board</strong>: The board state is printed to the console after each turn.</li>
  <li><strong>Player Input</strong>: Players are prompted to select their marker and desired board position.</li>
  <li><strong>Placing a Marker</strong>: The selected position on the board is updated with the player's marker.</li>
  <li><strong>Checking for a Win</strong>: The game checks for winning combinations after each turn.</li>
</ul>

<h2 id="license">License</h2>
<p>This project is licensed under the MIT License - see the LICENSE file for details.</p>

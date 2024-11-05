
<body>

<h1>🎬 MovieManagerAPI</h1>
<p>A RESTful API built with Spring Boot and H2 Database for managing a collection of movies. This application supports CRUD operations on movie records.</p>

<h2>📋 Features</h2>
<ul>
  <li>Retrieve all movies</li>
  <li>Retrieve a movie by ID</li>
  <li>Add a new movie</li>
  <li>Update an existing movie</li>
  <li>Delete a movie</li>
</ul>

<h2>🛠️ Setup Instructions</h2>

<h3>Prerequisites</h3>
<ul>
  <li>Java 11 or higher</li>
  <li>IntelliJ IDEA or another Java IDE</li>
  <li>Postman or any API testing tool (optional for testing)</li>
</ul>

<h3>Steps to Run</h3>
<ol>
  <li>Clone the repository:
    <pre><code>git clone https://github.com/your-username/MovieManagerAPI.git</code></pre>
  </li>
  <li>Open the project in IntelliJ IDEA.</li>
  <li>Run the application.</li>
  <li>Access the API at <code>http://localhost:8080/api/movies</code>.</li>
</ol>

<h2>📚 API Endpoints</h2>

<h3>Get All Movies</h3>
<pre><code>GET /api/movies</code></pre>
<p>Retrieve a list of all movies.</p>

<h3>Get Movie by ID</h3>
<pre><code>GET /api/movies/{id}</code></pre>
<p>Retrieve a movie by its ID.</p>

<h3>Add a New Movie</h3>
<pre><code>POST /api/movies</code></pre>
<p>Add a new movie with a JSON body.</p>
<p><strong>Example JSON Body:</strong></p>
<pre><code>{
  "title": "Inception",
  "genre": "Sci-Fi",
  "director": "Christopher Nolan",
  "releaseYear": 2010
}</code></pre>

<h3>Update an Existing Movie</h3>
<pre><code>PUT /api/movies/{id}</code></pre>
<p>Update a movie's details by ID.</p>
<p><strong>Example JSON Body:</strong></p>
<pre><code>{
  "title": "Inception",
  "genre": "Sci-Fi",
  "director": "Christopher Nolan",
  "releaseYear": 2010
}</code></pre>

<h3>Delete a Movie</h3>
<pre><code>DELETE /api/movies/{id}</code></pre>
<p>Delete a movie by its ID.</p>

<h2>📂 Project Structure</h2>
<ul>
  <li><code>controller/</code> - Contains the REST controller classes</li>
  <li><code>service/</code> - Contains the service layer for business logic</li>
  <li><code>repository/</code> - Contains the JPA repository interfaces</li>
  <li><code>model/</code> - Contains the entity classes</li>
</ul>

<h2>🔗 H2 Database Console</h2>
<p>The application uses an in-memory H2 database. You can access the H2 database console at <code>http://localhost:8080/h2-console</code> to view the data.</p>

<h2>📄 License</h2>
<p>This project is licensed under the MIT License.</p>

</body>
</html>

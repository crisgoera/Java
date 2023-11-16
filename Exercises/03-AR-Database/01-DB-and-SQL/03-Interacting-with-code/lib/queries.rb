require "sqlite3"
db = SQLite3::Database.new("lib/db/jukebox.sqlite")
rows = db.execute("SELECT * FROM artists LIMIT 3")

def artist_count(db)
  # TODO: use `db` to execute an SQL query against the database.
  # Should return an integer of the number of artists.
  result = db.execute("SELECT COUNT(*) FROM artists;")
  result[0][0]
end

def number_of_rows(db, table_name)
  # TODO: count number of rows in table table_name.
  result = db.execute("SELECT COUNT(*) FROM #{table_name};")
  # Should return an integer of the number of rows.
  result[0][0]
end

def sorted_artists(db)
  # TODO: return array of artists' names sorted alphabetically.
  result = db.execute("SELECT name FROM artists ORDER BY name ASC;")
  # Should return an array of strings sorted alphabetically.
  result.flatten
end

def love_tracks(db)
  # TODO: return array of love songs' names.
  result = db.execute("SELECT name FROM tracks WHERE name LIKE '%love%';").flatten
  # Should return an array of strings (track names).
end

def long_tracks(db, min_length)
  # TODO: return an array of tracks' names verifying: duration > min_length (minutes) sorted by length (ascending).
  lenght_in_ms = min_length * 60 * 1000
  result = db.execute("SELECT name FROM tracks WHERE milliseconds > #{lenght_in_ms} ORDER BY milliseconds ASC;")
  # Should return an array of strings.
  result.flatten
end

def albums_per_artist(db)
  # TODO: return an array of arrays, each containing the artist's name and the number of albums they have
  query = <<~SQL
    SELECT artists.name, COUNT(*)
    FROM artists JOIN albums ON artists.id = albums.artist_id
    GROUP BY artists.name ORDER BY artists.name ASC;
  SQL
  result = db.execute(query)
end

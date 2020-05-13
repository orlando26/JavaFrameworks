CREATE PROCEDURE `FIND_ALBUM_BY_SONG_ID`(IN song_id INT)
BEGIN
    select * from albums where id = (select album_id from songs where id = song_id);
END

CREATE PROCEDURE `FIND_ALBUM_BY_SONG_TITLE`(IN song_title varchar(50))
BEGIN
    select * from albums where id = (select album_id from songs s where s.Title  = song_title);
END

CREATE DEFINER=`tecgurus`@`%` PROCEDURE `FIND_SONGS_BY_ALBUM_ID`(IN album_id INT)
BEGIN
    SELECT * FROM songs s WHERE s.album_id = album_id;
END

CREATE DEFINER=`tecgurus`@`%` PROCEDURE `GET_TOTAL_SONGS_IN_ALBUM`(IN album_id INT, OUT total INT)
BEGIN
    select count(*) from songs s where s.album_id = album_id;
END
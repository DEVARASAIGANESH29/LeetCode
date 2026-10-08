SELECT 
    lib.book_id,
    lib.title,
    lib.author,
    lib.genre,
    lib.publication_year,
    COUNT(bor.book_id) AS current_borrowers
FROM library_books AS lib
LEFT JOIN borrowing_records AS bor
    ON lib.book_id = bor.book_id 
    AND bor.return_date IS NULL
GROUP BY 
    lib.book_id,
    lib.title,
    lib.author,
    lib.genre,
    lib.publication_year,
    lib.total_copies
HAVING 
    COUNT(bor.book_id) = lib.total_copies
ORDER BY 
    current_borrowers DESC, 
    lib.title ASC;

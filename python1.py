import xml.etree.ElementTree as ET

# Чтение XML файла
tree = ET.parse('library.xml')
root = tree.getroot()

# Вывод данных о книгах
books = []
total_price = 0

for book in root.findall('book'):
    title = book.find('title').text
    author = book.find('author').text
    year = book.find('year').text
    genre = book.find('genre').text
    price = float(book.find('price').text)
    
    books.append({
        'Название': title,
        'Автор': author,
        'Год': year,
        'Жанр': genre,
        'Цена': price
    })
    
    total_price += price
    print(f"Название: {title}, Автор: {author}, Год: {year}, Жанр: {genre}, Цена: {price:.2f}")

# Вычисление средней цены
average_price = total_price / len(books)
print(f"Средняя цена: {average_price:.2f}")

# Фильтрация книг по жанру
genre_filter = "Фантастика"
filtered_books = [book for book in books if book['Жанр'] == genre_filter]

print(f"\nКниги в жанре '{genre_filter}':")
for book in filtered_books:
    print(f"Название: {book['Название']}, Автор: {book['Автор']}")

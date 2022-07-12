from PIL import Image
import pytesseract
pytesseract.pytesseract.tesseract_cmd=r'C:\Program Files\Tesseract-OCR\tesseract.exe'

image= Image.open('Screenshot_2.png')
txt=pytesseract.image_to_string(image, lang='eng')

print(txt)
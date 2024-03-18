# Flipkart Product Search Automation using BrowserStack🛒🔍 

This project automates the process of searching for a product on Flipkart, applying filters, sorting the results, and extracting product information.

## Video 🎥

You can view the video of the automated process on the following link: [https://drive.google.com/file/d/1LhATQLkVi9y4ee_YOm43Z-kzbL9o_0TG/view?usp=sharing](https://drive.google.com/file/d/1LhATQLkVi9y4ee_YOm43Z-kzbL9o_0TG/view?usp=sharing)


## Steps Performed 📝

1. Navigate to flipkart.com.
2. Search for the product "Samsung Galaxy S10".
3. Click on "Mobiles" in categories.
4. Apply filters for "Brand: Samsung" and "Flipkart assured".
5. Sort the entries with Price -> High to Low.
6. Read the results on page 1.
7. For each result, extract the product name, display price, and link to the product details page.
8. Print the extracted information on the console.

## Libraries Used 📚

- Selenium: For automating the web browser interaction.

## Setup ⚙️

1. Replace `username` and `browserstack_key` in `browserstack.yml` file with your actual BrowserStack username and key.
2. Head over to the root folder and run `Maven Test`.

## Output 📊

The console will display a list of products with their names, display prices, and links to their details page. On the BrowserStack dashboard, you can view the video of the automated process.



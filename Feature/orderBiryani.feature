Feature: a user should be able to order Biryani from Swiggy
@pizza
Scenario: Order Pizza From Swiggy
Given a user is on the home of Swiggy

And he Enters location as "<city>"
And he selects first location from suggested location in suggestion-box
And he redirects to ItemPage
And he hover over search icon
And He Enters Item as "VegBiryani"
And he select first suggested Item in Biryani cateogory
And he searchs resturant and select first restaurant
And he redirects to orderPage 
And he adds first item to cart 
And he click on checkout button
Then he should be able to order a Biryani suscessfully 

Examples: 
|city|
|Hyderabad|
|Chennai|

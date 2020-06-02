Feature: Myntra Masks Feature
  This Feature will test Abilty to purchase Myntra Masks 
  
  Background: 
   Given Myntra Homepage is launched.  
 
  @Sanity   @Sprint1 
  Scenario: Verify Essential masks can be purchased by customer 
  	When Customer Mouse over essential dropbox
    And Customer click on masks
    And Customer should click on Wildcraft brand
    And Customer click On 3pcs 6 layer reusable masks
    And Customer click on size
    And Customer click on Add to Bag
    And Customer click on Go to bag
    Then Customer click on Place Order
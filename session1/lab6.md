# Lab 6: Define Your REST API Endpoints
|Resources|HTTP Verb|Resource URL                                              |Use Representation Case                                                                 |
|---------|---------|----------------------------------------------------------|----------------------------------------------------------------------------------------|
|Visitor  |GET      |/zoo/[zooId]/visitors                                     |Get the list of visitors                                                                |
|Visitor  |GET      |/zoo/[zooId]/visitors/[visitorId]                         |Get the details of a visitor using their ID number                                      |
|Visitor  |GET      |/zoo/[zooId]/visitors/[visitorId]/tickets                 |Get the list of tickets that are currently being held by a visitor using their ID number|
|Visitor  |GET      |/zoo/[zooId]/visitors/[visitorId]/tickets/[tickerNumber]  |Get the details of a ticket of a visitor using both the ticket number and ID number     |
|Visitor  |GET      |/zoo/[zooId]/visitors/[visitorId]/tasks                   |Get the list of tasks that a visitor can do using their ID number                       |
|Visitor  |POST     |/zoo/[zooId]/visitors/[visitorId]/tickets                 |Buy a ticket                                                                            |
|Visitor  |DELETE   |/zoo/[zooId]/visitors/[visitorId]                         |Leave the zoo                                                                           |
|Tickets  |GET      |/zoo/[zooId]/tickets                                      |Get the list of tickets                                                                 |
|Tickets  |GET      |/zoo/[zooId]/tickets/[ticketNumber]                       |Get the details of a ticket using ticket number                                         |
|Shops    |GET      |/zoo/[zooId]/locations                                    |Get the list of locations                                                               |
|Shops    |GET      |/zoo/[zooId]/locations/shops                              |Get the list of shops                                                                   |
|Shops    |GET      |/zoo/[zooId]/locations/shops/products                     |Get the list of products of all shops                                                   |
|Shops    |GET      |/zoo/[zooId]/locations/shops/[shopId]/products            |Get the list of products that a shop is selling using its ID number                     |
|Shops    |POST     |/zoo/[zooId]/locations/[locationId]                       |Go to location                                                                          |
|Shops    |POST     |/zoo/[zooId]/locations/shops/[shopId]/products/[productId]|Buy a product from a shop using both the shop ID and product ID                         |
|Animals  |GET      |/zoo/[zooId]/animals                                      |Get the list of animals                                                                 |
|Animals  |GET      |/zoo/[zooId]/animals/[animalId]                           |Get the details of an animal using its ID number                                        |
|Animals  |POST     |/zoo/[zooId]/animals/[animalId]                           |Feeds an animal                                                                         |

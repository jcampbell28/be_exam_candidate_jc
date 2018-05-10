# SCOIR Technical Interview for Back-End Engineers
This repo contains an exercise intended for Back-End Engineers.

## Instructions
1. Fork this repo.
1. Using technology of your choice, complete [the assignment](./Assignment.md).
1. Update this README with
    * a `How-To` section containing any instructions needed to execute your program.
    * an `Assumptions` section containing documentation on any assumptions made while interpreting the requirements.
1. Before the deadline, submit a pull request with your solution.

## Expectations
1. Please take no more than 8 hours to work on this exercise. Complete as much as possible and then submit your solution.
1. This exercise is meant to showcase how you work. With consideration to the time limit, do your best to treat it like a production system.


## Solution
- So I decided to make a file reader that would parse the data into Java objects (POJOs)
- This was done by splitting the csv file into an array by the commas that separated the values
- Once that was done I decided to add any entry to an ArrayList of entries
- I then had to also create a Watch service to see whenever a file was updated, created, or deleted

##Future Steps
- I was not able to complete the program in 8 hours because there were some things I was not familiar with so I decided to research these areas
- Things I was not able to accomplish but would build on:
    - Making sure that all the information was not empty and how to handle that with either default values or blank values
    - Using Regex to confirm the phone numbers were in ###-###-#### format
    -  Putting a maximum count on the Strings for all names and id number
    
##Areas of Improvement
- Overall this was a great learning experience for me - If I had a little more time I would have been able to build out the program more effectively
- However, I learned what a csv file was and how it will relate to a job setting / real work environment
- Thank you for this opportunity
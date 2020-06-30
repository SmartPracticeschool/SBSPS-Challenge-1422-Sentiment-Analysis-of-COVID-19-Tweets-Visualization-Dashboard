# IBM Hack Challenge 2020
## Sentiment Analysis of COVID-19 Tweets-Visualization-Dashboard
![alt text](https://user-images.githubusercontent.com/66111230/86078930-d6da6680-baac-11ea-89d7-cdcc8e9bc7f7.jpg)
# Team Techy Warriors
This repository contains all code files and data we used in the IBMHC 2020 project for the Sentiment Analysis of COVID-19 Tweets. 
In this project, we utilized twitter data, leveraged NLP techniques to process the text data, analyzed the data by sentiment analysis using TextBlob and IBM Tone Analyzer, and created Tableau dashboard to present the results.
# Overview
To visualize Sentiments of Indians after the extension of lockdown announcements based on tweets with the relevant #tags on twitter and build dashboards as a daily sentiment monitor product to present the results.
# Purpose
The purpose of this project is as follows:
1. To gain an overview of the wider public opinion behind certain topics such as lockdown guidelines, government rules, work from home, etc. 
2. To use sentiment analysis as a means to gauge public opinion so that the concerned authority can be able to strategize and plan for the future.
# Existing Problem
Everyone around the globe today is holed up in their homes, scared of human touch, as a minuscule virus took down their entire world. We are all emotionally impacted in some way. With fear, loneliness, anxiety, depression, social isolation, anger, paranoia, economic hardship, surplus of new warnings do's and don'ts - those already on edge have been pushed over, while others have been pushed closer to the precipice. On one hand we have millions fighting the illness and on the other hand many are worried of contracting it.
 
Rumours and warnings abound in a situation where nobody seems to know any better. Everyone has advice to share, but nobody can guarantee protection. Caught in the midst of so many instructions, we tend to lose touch with our own common sense and the place from where we draw our feelings of security.
 
Social interactions and face-to-face connection are important to us, but today we are forced to socially distance ourselves. Disrupting these bonds leads to health problems such as psychological issues, depression, high BP and heart disease. 
 
So now we are in a situation where instinctively we ache for connection and technology has been a big help in keeping us connected, ensuring the feeling of closeness and shared identity, which helps in times of crises. We need to find innovative ways and means around the present crisis. Many of these may form the design of our future lives!

# Proposed solution
In order to gain respite from the existing problem and give our small yet valuable contribution, we proposed a solution which is described as follows-
The Corona Virus pandemic poses a threat to our physical health, but alongside, living a Covid-lifestyle (social distancing, lockdown extensions, work from home, etc.) also endangers our emotional well-being. Thus, it is crucial to understand public sentiments under COVID-19. 
Our proposed solution aims at developing an application to visualize sentiments of Indians after the extension of lockdown announcements based on tweets with the relevant hash tags on twitter and build dashboards as a daily sentiment monitor product to present the results. It will give a simple interface which will present the public approach of people in India on varied topics through their sentiments visualised as graphs onto beautified dashboards by simply hitting a button in the app. 
This proposed system will come in handy as it comes with a simple user interface which will enable users to get quick and reliable overview of the public approach.

# Project Flow
![alt text](https://user-images.githubusercontent.com/66111230/86079857-1e61f200-baaf-11ea-90f8-5cfd3e388fe9.PNG)

# Our data source includes
Confirmed Cases:
Time series data of confirmed cases: Kaggle (daily data from 30-01-2020 to 15-06-2020)

Url Link- https://www.kaggle.com/sudalairajkumar/covid19-in-india/data

Twitter:
Tweets on Twitter retrieved with TwitterScraper API and GetOldTweet 
To extract this data we used various queries that were directly related to Covid-19 which are(#MigrantIndia, #Atmanirbhar, #examoverhealth, #GoCoronaGo, #LOCKDOWNINDIA, #quarantineIndia, #CoronavirusIndia, #SocialDistancingIndia, #StaySafeIndia, #UNLOCK, #UNLOCKINIDA, #coronaupdatesindia, #COVID19INDIA, #INDIAFIGHTSCORONAVIRUS.)
Duration-

Lockdown 1: 20 March 2020 - 14th April 2020

Lockdown 2: 15 April 2020 - 3rd May 2020

Lockdown 3: 4th May 2020 - 17th May 2020

Lockdown 4: 18th May 2020 - 31st May 2020

Latest Trends: 14th June 2020 to 17th June 2020

# Sentiment Analysis Process
![alt text](https://user-images.githubusercontent.com/66111230/86081108-2b341500-bab2-11ea-9c26-fc41b95953f8.png)

## A) TextBlob Sentiment Analysis

TextBlob is a Python (2 and 3) library for processing textual data. It provides a simple API for diving into common natural language processing (NLP) tasks such as part-of-speech tagging, noun phrase extraction, sentiment analysis, classification, translation, and more. 

Here we have used Sentiment analysis. Sentiment analysis is basically the process of determining the attitude or the emotion of the writer, i.e., whether it is positive or negative or neutral.The sentiment function of textblob returns two properties, polarity, and subjectivity. Polarity is float which lies in the range of [-1,1] where 1 means positive statement and -1 means a negative statement. Subjective sentences generally refer to personal opinion, emotion or judgment whereas objective refers to factual information. Subjectivity is also a float which lies in the range of [0,1].

## B) IBM Watson Tone Analyzer

![alt text](https://user-images.githubusercontent.com/66111230/86081338-c2996800-bab2-11ea-86ee-7c904d010d2a.PNG)

![alt text](https://user-images.githubusercontent.com/66111230/86081361-ce852a00-bab2-11ea-928f-ecac896d9496.PNG)

We choose to use IBM’S Tone Analyser (a cloud service) to do the sentiment analysis because it can provide different tones of the text data which is more than positive-negative sentiment analysis. Through this way, we can study the tweets' emotion more specifically. 

The data collection was followed by sentiment analysis which was further visualised using tableau public into dashboards

# Visualisation in Tableau Public

Visualisation of the contents of the tweets was done with Tableu which is attached in the folder entitled as "Dashboards". You'll need the Tableau Desktop app to view the document other way of accessing the file is with the help of the following URL links-


COVID-19 India Analysis 

https://public.tableau.com/profile/misbah.aslam.sirnaik#!/vizhome/Dashboard-1CONFIRMEDCASES/COVID-19INDIAANALYSIS?publish=yes

Percentage comparison of death vs cured

https://public.tableau.com/profile/misbah.aslam.sirnaik#!/vizhome/Dashboard-1CONFIRMEDCASES/PercentageComparisonofdeathsvscured?publish=yes

Lockdown 1

https://public.tableau.com/profile/misbah.aslam.sirnaik#!/vizhome/Lockdown1_15929942182670/Lockdown1?publish=yes

Lockdown 2 and 3
 
https://public.tableau.com/profile/misbah.aslam.sirnaik#!/vizhome/Lockdown23/SentimentsduringLockdownPhaseTextBlob?publish=yes

Lockdown 4 

https://public.tableau.com/profile/misbah.aslam.sirnaik#!/vizhome/Lockdown4_15929911238010/Lockdown4?publish=yes

Covid-19 related trendy tweets in India

https://public.tableau.com/profile/techy.warriors#!/vizhome/Covid-19RelatedTweetsIndia_15929951157150/Sheet1

Overall Sentiment change 

https://public.tableau.com/profile/techy.warriors#!/vizhome/OverallSentimentChange-7emotions_15930084055550/Dashboard1?publish=yes

# MIT App
MIT App inventor is a web application IDE originally provided by Google, and now maintained by the Massachusetts Institute of Technology (MIT). We used it for developing our end-user application through which the concerned authority can easily interact with our dashboards and gain corresponding insights.

# Advantages and Disadvantages

Advantages:

1. Successfully identifying which messages and conversations act as emotion trigger that changes people’s mood.
2. You can easily identify unsatisfied people with the decision of the government.
3. On tracking overall satisfaction you will get bigger picture.

Disadvantages:

1. There are few tweets extracted from twitter that are quite gibberish which do not contribute to the purpose of our goal.
2. Automated sentiment analysis tools do a really excellent work of analysing text or opinion and attitude but they are not perfect.
3. Sentiments and emotions can be easily determined by a text but if it is expressed through a picture / video or any other similar form then analysis might get wrong.

 
# Application

1. Government Bodies: Comprehend the state of mind of people residing in the country and accordingly take necessary actions, be able to control negative rumours spreading during this period for the social good, etc.

2. Business- Business Owners, entrepreneurs, etc. can keep a watchful eye on trending topics and people’s emotion change by running marketing campaign and finding out potential business opportunities, such as new services that is needed by people.

3. Medical Institutions: Our analysis can help medical institutions know the emotion changes and mood fluctuations during the COVID-19. Doctors can provide assistance to people who have mental health issues such as depression and other mental illnesses.

4. Counsellors: With the help of the data, counsellors can reach out to many potential individuals suffering from psychological problems and help them find a respite.



# Conclusion

In this project, we analysed the sentiments of COVID-19-related tweets in several ways. The overall trend shows that the public has been more optimistic over time. Digging into the multi-dimensional sentiment analysis, we found that the sentiment “Assertive” went up and “Fearful” went down through the time. 
To fight the coronavirus not only needs the guidance from the government but also a positive attitude from the public. Our analysis provides a potential approach to reveal the public’s sentiment status and help institutions respond timely to it.

# Acknowledgement

The perfect way to document this project would be to acknowledge all those people who directly or indirectly encouraged, supported us with their value added inputs without them this project would not have been this better. We express our sincere gratitude to the entire team of IBM and Smart Internz to have bestowed this wonderful opportunity onto us. We heartily thank our project guides, Mr. Hemant Kumar Gahlot and Ms. Lolla Lalitha Gayatri for their guidance and suggestions during this project work. We are thankful to and fortunate enough to get constant encouragement, support and guidance through live boot camp sessions arranged by Smart Internz platform which helped us in successfully completing our project work. 




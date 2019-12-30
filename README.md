# Stock-Exchange-Matching-Algorithm
The Stock Exchange Matching Algorithm works in the following way:

It is parametrized by n pairs of parameters (Si,Pi) for i=0,1,...,n-1. Each Si is unique and if a customer wants to buy m shares, 
the algorithm will first find the largest Si such that Si <= m and then find a price Pi for one share, i.e. a price coupled with the chosen
Si. There are k customers, and the i-th of them has requested to buy exactly Qi shares. For each such request print the price of one share,  
Pi that the algorithm will give.

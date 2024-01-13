female(marry).
likes(marry,food).
likes(marry,wine).
likes(john,wine).

likes(john,X) :- female(X), likes(X,wine).

/** <examples>
?- likes(john,marry)
?- likes(john,X), likes(marry,X).
*/

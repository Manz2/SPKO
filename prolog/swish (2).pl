female(mary).
thief(john).
likes(john, wine).
likes(mary, food).
likes(mary, wine).
likes(john, X) :- female(X), likes(X, wine).
may_steal(X, Y):- thief(X), likes(X,Y).

/** <examples>
?- may_steal(X,wine)
?- may_steal(john,X)
*/

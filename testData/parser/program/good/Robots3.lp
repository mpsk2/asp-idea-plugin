
#program state(t).

goon(t) :- target(R,X,Y), not pos(R,X,Y,t).
#minimize{ 1,t : goon(t) }.

#program check(t).

#external horizon(t).

:- goon(t), horizon(t).

#show move/4.
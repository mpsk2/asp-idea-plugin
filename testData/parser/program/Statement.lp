// Head Statement
manga + danga > #min { a, b, c, d : 45 } < 45 :- x, y, d(X, Y, Z).

// If Statement
:- x, y, d(X, Y, Z); d(11).

// Disjoint Statement
#disjoint {a:b $+ c: not #true} :- x,y,z(1,2,3).

// WIf Statement
:~ d(X, 1), d(X, 2). [
    X @ 13
]

// Minimize/Maximize Statement
#maximize {}.
#minimize {
    a @ b,c,d: ;
    d @ e,f,g : h, i, j
}.

// Edge Statement
#edge ( a, b; c, d; e, f) :.

// Heuristic Statement
#heuristic -abecadlo :.  [x + y + z @ a * b + c, d - e]

// Project Statement
#project - xyz / 5.
// #project random $+ (x, y, z) :.

// Define Statement
#const random = x + y + z.

// Block Statement
#program veryBigProgram (
    x, y, z
).
#program otherBigProgram ().
#program verySmallProgram.
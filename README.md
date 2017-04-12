# Phonemes-Assignment-
The program is consisted of 10 classes.
The main class is FileManager where everything is done. The other 9 classes are – superclass Phonemes and then subclasses – Stops, Closures, Fricatives, Affricatives, Nasals, Semivowels, Vowels and Others(where the phonemes that are not from the other 7 goes in).

The program works in two ways. The first is when there are only two arguments written in the command line in the following order – the input file name with the suffix for file type and a name for outputfile.The samplerate is defaulted to 16 000. All the output files are of type .dat.

The second way is when the user types in the flag –s, for first argument, sample rate for second and then input and output arguments. If something goes wrong there is a statement that gets printed and the program is terminated.

If the user successfully enter the program, up to 8 different .dat files are created depending on the data given.

Inside, the program goes trough every line and stores the variables from every line as follows. First it takes the phoneme and then it gets the start and end times. After that the program loops to see the type of the phoneme and stores it as respective, if it doesn’t belong to one of the seven types it goes into “Others”. I am then storing every different list into another list, which at least I think helps me to create cleaner code by using for loops. Through a constructor in the superclass and then inherited in the sub classes I am storing the information given in the input file. Till this point I have used the superclass to print out the information stored. I chose this structure since I am only working with 2 classes – the FileManager and Phonemes’ superclass. It is tidier and easy to work with inheritance. If I needed to manipulate the data in every subclass it could easily be done.

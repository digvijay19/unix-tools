unix-tools
==========
unix-tools contains replication of unix tools like ` wc , cut , sort , head , tail , uniq ` and extra functionality of `remove-space`.

#### wc :

* Used to count characters,words,and lines in a file.

```
dgwc.sh filename
```

#### cut :

* `cut` is used to cut specified field in a file.
* You can specify delimiter with -d , default delimiter is space.
* -f is used to specify the field from file eg -f2.

```
dgcut.sh filename -f2 -d" "
```

#### sort :

* `sort` command is used to sort data by lines in a file.

```
dgsort.sh filename
```

#### head :

* `head` is used to give header lines in the file.
* -n option can be specified to get n number of lines, default is 10

```
dghead.sh filename -n5
```

#### tail :

* `tail` is used to give tailer lines in the file.
* -n option can be specified to get n number of lines, default is 10

```
dgtail.sh filename -n5
```

#### uniq :

* `uniq` is used to get uniq lines in a file.
* `uniq` avoids concurrent duplicate lines in a file.

```
dguniq.sh filename
```

#### remove-space :

* `remove-space` is removes all extra spaces in the specified file.

```
dgremove-space.sh filename
```

# datastruct-lab7
Commit your codes here


## Common Git Comamnds

**1. Cloning**
```
git clone [repository]
```
Clone the repository to your laptop, for example:
```
git clone https://github.com/desmondyeoh/datastruct-lab7
```

**2. Staging**
```
git add .
```
Add all files to staging

**3. Committing**
```
git commit -m [message]
```
Commit changes to local repository, add a message to tell what has changed, example:
```
git commit -m "Add setter and getter"
```

**4. Pushing**
```
git push origin master
```

**5. Pulling**
```
git pull origin master
```
Pulls the code from remote repository to local repository and merge to local repository.
You'll have to resolve any merge conflict.
Shorthand for `git fetch` and then `git merge`. 

## Common workflow:
First Time:
Clone -> *Change codes* -> Add to staging -> Commit --> Push

2nd Time Onwards:
*Change codes* -> Commit -> Pull -> *Resolve merge conflicts* -> Push


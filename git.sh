#!/bin/bash
git add .
echo "Introduce un titulo al commit"
read commit
git commit -m "$commit"
git push

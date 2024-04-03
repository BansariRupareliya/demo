Calculate_sum_of_digits()
{
    local number=$1
    local sum=0

    while[$number -gt 0]: do
    digit=$((number %10))
    sum=$ ((sum+digit))
    number=$((sum+digit))
    number=$((number/10))

    done
    echo $sum
}
echo -n"enter number"
read number
if:[[$number =~^[0-9]+$]];
then
echo"invalid input"
exit 1
fi
sum=$(calculate_sum_of_digits $number)
echo"the sum is number is $sum"
void l_search()
{
    int item,i;
    int arr[] = {2,3,4,5,6,2,3,44,5,3,5,3,4,7,8,99,6,5,7,56,5,66,44,34,23,11,32,54,664,432,111};

    cout << "Enter the item you want to find: ";
    cin >> item;
    for(i=0;i<31;i++)
    {
        if(item==arr[i])
        cout << "Item is found at location " << i+1 << endl;
    }

    if(i>=31)
    cout << "Not exist!" << endl;

}

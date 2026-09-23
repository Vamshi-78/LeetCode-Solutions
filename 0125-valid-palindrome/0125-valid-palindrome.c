bool isPalindrome(char* s) {
    int n=strlen(s);
    int l=0;
    char *ans=malloc(n*sizeof(char));
    for(int i=0;i<n;i++){
        if((s[i]>='a'&&s[i]<='z')||(s[i]>='A'&&s[i]<='Z')||(s[i]>='0'&&s[i]<='9')){
            if(s[i]>='A'&&s[i]<='Z'){
                s[i]=s[i]+32;
            }
            ans[l]=s[i];
            l++;
        }
    }
    int left=0;
    int right=l-1;
    while(left<right){
        if(ans[left]!=ans[right]){
            return false;
        }
        left++;
        right--;
    }
    return true;
}
#include <bits/stdc++.h>
using namespace std;
int main(){
        long long n , m  , sum = 0 ,mx = 0;
        cin>>n>>m;
        vector<long long > arr(n + 1);
            for (int i = 0 ;i < n ;i ++)
                cin>>arr[i];
            sort(arr.begin() ,arr.end());
           long long left = 0;
           long long right = arr[arr.size() - 1];
            while (left <= right){
              long long mid = (left + right) / 2;
                int cnt = 0;
                    if (mid > 0){
                        for (int i = 0 ;i < arr.size(); i++){
                            cnt = cnt + (arr[i] / mid);
                        }
                    }
                    if (cnt >= m){
                        mx = max(mx , mid);
                        left = mid + 1;
                    }
                    else
                        right = mid - 1;

            }
        cout<<mx<<endl;
}


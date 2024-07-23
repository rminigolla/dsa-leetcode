/**
 * @param {number[]} gain
 * @return {number}
*/


var largestAltitude = function(gain) {
    let sum = 0;
    let newarr = [];
    for(let i = 0;i<=gain.length;i++){
        newarr.push(sum);
        sum = sum+gain[i];
    }
    let max = newarr[0];
    for(let j = 0;j<newarr.length;j++){
        if(max<newarr[j]){
            max = newarr[j];
        }
    }
    return max
    
};
/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
    
    return async function(...args) {
        let res = new Promise((resolve , reject) => {
            const timeout = setTimeout(()=>{
                reject("Time Limit Exceeded");
            }, t)


            const result = fn(...args);
                result
                .then((res)=>{
                    resolve(res);
                })
                .catch((error)=>{
                    reject(error);
                })
        })

        return res;
    }
};

/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */
import { HTTP } from '../http-common'

HTTP.get(`${'offre/'}`)
    .then(response => {
        this.posts = response.data
        console.log(this.posts)
    })
    .catch(e => {
        this.errors.push(e)
    })

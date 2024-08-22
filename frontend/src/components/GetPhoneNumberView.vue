<template>

    <v-data-table
        :headers="headers"
        :items="getPhoneNumber"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'GetPhoneNumberView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "phoneNumber", value: "phoneNumber" },
            ],
            getPhoneNumber : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/getPhoneNumbers'))

            temp.data._embedded.getPhoneNumbers.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.getPhoneNumber = temp.data._embedded.getPhoneNumbers;
        },
        methods: {
        }
    }
</script>


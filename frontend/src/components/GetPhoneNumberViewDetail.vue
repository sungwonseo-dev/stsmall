<template>

    <v-card outlined>
        <v-card-title>
            GetPhoneNumber # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="PhoneNumber" v-model="item.phoneNumber" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'GetPhoneNumberViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/getPhoneNumbers/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>


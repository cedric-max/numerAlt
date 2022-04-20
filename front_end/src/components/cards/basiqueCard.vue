<template>
  <v-col  cols="12" lg="4" md="6">
    <v-hover
        v-slot:default="{ hover }"
        close-delay="50"
        open-delay="50"
    >

      <div>
        <v-card
            :color="hover ? 'white' : 'transparent'"
            :elevation="hover ? 12 : 0"
            flat
            hover
            to="/detail"
        >
          <v-img
              :aspect-ratio="16 / 9"
              class="elevation-2"
              gradient="to top, rgba(25,32,72,.4), rgba(25,32,72,.0)"
              height="200px"
              src="https://cdn.pixabay.com/photo/2020/12/23/14/41/forest-5855196_1280.jpg"
              style="border-radius: 16px"
          >
            <v-card-text>
              <v-btn color="accent" to="category">TIPS</v-btn>
            </v-card-text>
          </v-img>

          <v-card-text>
            <div class="text-h5 font-weight-bold primary--text">
              How to write an awesome blog post in 5 steps
            </div>

            <div class="text-body-1 py-4">
              Ultrices sagittis orci a scelerisque. Massa placerat
              duis ultricies lacus sed turpis
            </div>

            <div class="d-flex align-center">
              <v-avatar color="accent" size="36">
                <v-icon dark>mdi-feather</v-icon>
              </v-avatar>

              <div class="pl-2">Yan Lee · 22 July 2019</div>
            </div>
          </v-card-text>
        </v-card>
      </div>

    </v-hover>
  </v-col>
</template>

<script>
export default {
  name: "basiqueCard"
}
</script>

<style scoped>

</style>

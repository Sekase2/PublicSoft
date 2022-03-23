<template>
  <el-dialog type="warning" title="Διαχείριση προμηθευτών" :visible="visible" :modal="true"
             :close-on-click-modal="false"
             :close-on-press-escape="false" :modal-append-to-body="false" :show-close="false" width="75%"
             @close="clearValidation">
    <el-card>
    <el-form ref="supplierForm" :model="supplier" :rules="rules" label-position="top">
      <el-row :gutter="20">
        <!-- LEFT COLUMN -->
        <el-col :span="12">
          <el-form-item label="Εισάγετε το όνομα της εταιρίας"
                        prop="companyName">
            <el-input prefix-icon="fa fa-companyName"
                      v-model="supplier.companyName"
                      placeholder="Όνομα εταιρίας"
                      autoComplete="companyName">
            </el-input>
          </el-form-item>

          <el-form-item label="Εισάγετε το όνομα σας"
                        prop="firstName">
            <el-input prefix-icon="fa fa-name"
                      v-model="supplier.firstName"
                      placeholder="Όνομα"
                      autoComplete="onom">
            </el-input>
          </el-form-item>
          <el-form-item label="Εισάγετε το επίθετο σας"
                        prop="lastName">
            <el-input prefix-icon="fa fa-lastName"
                      v-model="supplier.lastName"
                      placeholder="επίθετο"
                      autoComplete="onom">
            </el-input>
          </el-form-item>
          <el-form-item label="Εισάγετε το ΑΦΜ σας"
                        prop="companyName">
            <el-input prefix-icon="fa fa-vatNumber"
                      v-model="supplier.vatNumber"
                      placeholder="ΑΦΜ"
                      autoComplete="vatNumber">
            </el-input>
          </el-form-item>
          <el-form-item label="Εισάγετε την εφορία σας"
                        prop="irsOffice">
            <el-input prefix-icon="fa fa-irsOffice"
                      v-model="supplier.irsOffice"
                      placeholder="εφορία"
                      autoComplete="irsOffice">
            </el-input>
          </el-form-item>
          <el-form-item label="Εισάγετε την διεύθυνση σας"
                        prop="address">
            <el-input prefix-icon="fa fa-address"
                      v-model="supplier.address"
                      placeholder="διεύθυνση"
                      autoComplete="address">
            </el-input>
          </el-form-item>
          <el-form-item label="Εισάγετε το όνομα τον ταχυδρομικό σας κώδικα"
                        prop="zipCode">
            <el-input prefix-icon="fa fa-zipCode"
                      v-model="supplier.zipCode"
                      placeholder="ΤΚ"
                      autoComplete="zipCode">
            </el-input>
          </el-form-item>
          <el-form-item label="Εισάγετε την πόλη σας"
                        prop="city">
            <el-input prefix-icon="fa fa-city"
                      v-model="supplier.city"
                      placeholder="Όνομα"
                      autoComplete="city">
            </el-input>
          </el-form-item>
          <el-form-item label="Εισάγετε την χώρα σας"
                        prop="lastName">
            <el-input prefix-icon="fa fa-country"
                      v-model="supplier.country"
                      placeholder="χώρα"
                      autoComplete="country">
            </el-input>
          </el-form-item>
        </el-col>
        <!-- RIGHT COLUMN -->
        <el-col :span="12">
        </el-col>
      </el-row>
    </el-form>
      <el-row>
        <el-col style="text-align: right">
          <el-button type="success"
                     icon="fa fa-save"
                     @click="save"> Αποθήκευση </el-button>

          <el-button type="danger"
                     icon="fa fa-remove"
                     @click="confirmDelete"
                     :disabled="!isDeletable"> Διαγραφή </el-button>
        </el-col>
      </el-row>
    </el-card>
    <div slot="footer" class="dialog-footer card-footer">
      <el-button type="warning"
                 icon="el-icon-back"
                 @click="cancel"> Επιστροφή </el-button>
    </div>
  </el-dialog>
</template>
<script src="./SupplierVM.js"></script>

const UserController = {
    index: (req, res) => {
        return res.send("Camada Controller do Node: OK!");
    }
};
module.exports = UserController;
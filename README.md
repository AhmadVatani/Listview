# Listview
Vertical and Horizontal ListView Using RecycleView and ViewHolder Pattern

## Horizontal Listview  ##
add below code after find your recycleview View.

```
LinearLayoutManager layoutManager= new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
recyclerView.setLayoutManager(layoutManager);
```


## Vertical Listview  ##
add below code after find your recycleview View.

```
LinearLayoutManager layoutManager= new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
recyclerView.setLayoutManager(layoutManager);
```


## Reverse Listview ##
the third parameter of ```LinearLayoutManager``` make reverse your listview! change ```false``` to ```true``` to reverse Listview.
